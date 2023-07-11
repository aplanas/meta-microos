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

RPM_NAME = "python310-samplerate-0.1.0-2.9.noarch.rpm"
RPM_HASH = "47b8680d4dd60c7cb81640c521aa3150592d9647344f97abe659c436995f8985b99cecd49a92956db18fb6c6397d579b19d44015a6195ed58e6e3a87f8c6fa2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-samplerate \
python310-samplerate \
python3dist-samplerate"

RDEPENDS:${PN} += "libsamplerate \
python-abi \
python310-cffi \
python310-numpy"

inherit rpm
