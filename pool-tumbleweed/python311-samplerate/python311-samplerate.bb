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

RPM_NAME = "python311-samplerate-0.1.0-2.9.noarch.rpm"
RPM_HASH = "ef64ef14454cf984e67d5745feab104c51c1ca45461a3540ab35c32baac352eb09d2a2e86c89a5d2a0c52b6073face5e4dc31a89abf6261f9e5dc30f4d99c687"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-samplerate \
python3.11dist-samplerate \
python311-samplerate \
python3dist-samplerate"

RDEPENDS:${PN} += "libsamplerate \
python-abi \
python311-cffi \
python311-numpy"

inherit rpm
