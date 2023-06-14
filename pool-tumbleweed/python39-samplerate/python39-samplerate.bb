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

RPM_NAME = "python39-samplerate-0.1.0-2.7.noarch.rpm"
RPM_HASH = "93223c9f75e8fb7ec8cac175dd4638252759974321d30988c61f92c1a603fe6148f184df92a4f02fbc58b868b935f03decce412430d67dda80f650bea7348467"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-samplerate \
python39-samplerate \
python3dist-samplerate"

RDEPENDS:${PN} += "libsamplerate \
python-abi \
python39-cffi \
python39-numpy"

inherit rpm
