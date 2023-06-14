SUMMARY = "Python bindings for libsamplerate"
DESCRIPTION = "This is a wrapper around Erik de Castro Lopo's libsamplerate (aka Secret \
Rabbit Code) for sample rate conversion. \
 \
It implements all three APIs available in libsamplerate: \
 \
* Simple API: for resampling a large chunk of data with a single library \
  call \
* Full API: for obtaining the resampled signal from successive chunks of \
  data \
* Callback API: like Full API, but input samples are provided by a callback \
  function"
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python310-samplerate-0.1.0-2.7.noarch.rpm"
RPM_HASH = "4ce17b9073f9c9af4bc178dbf4504153fcfd527e868a3a8491d876486a27ee6af7cb70327f8c419de302ad6fa8a4c3b9ec1aa1dbdd75bcc50aa9ff67f6fc36c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-samplerate \
python3.10dist-samplerate \
python310-samplerate \
python3dist-samplerate"

RDEPENDS:${PN} += "libsamplerate \
python-abi \
python310-cffi \
python310-numpy"

inherit rpm
