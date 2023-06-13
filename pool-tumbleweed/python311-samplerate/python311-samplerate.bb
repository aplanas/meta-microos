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

RPM_NAME = "python311-samplerate-0.1.0-2.7.noarch.rpm"
RPM_HASH = "42038cdb87936c70a1edff0bcc038b3c0f43b6ad419aa6016f6926a2e9ee3c829c0202b64f1e33fd22992d4527c8b7aa441e933d32733dd52f0280633d5be6db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(samplerate) \
python311-samplerate \
python3dist(samplerate)"

RDEPENDS:${PN} += "libsamplerate \
python(abi) \
python311-cffi \
python311-numpy"

inherit rpm
