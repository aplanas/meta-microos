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

RPM_NAME = "python39-samplerate-0.1.0-2.9.noarch.rpm"
RPM_HASH = "e56318ea027925f8379b96878646857f681656d8016657b7d16d6f6b3f0e24a4d82a42bbaf5e943e6bb6a5d64d61277b80abd39b6e7f47136b901186dcec26b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-samplerate \
python39-samplerate \
python3dist-samplerate"

RDEPENDS:${PN} += "libsamplerate \
python-abi \
python39-cffi \
python39-numpy"

inherit rpm
