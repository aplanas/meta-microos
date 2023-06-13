SUMMARY = "Configuration validator producing human readable error messages"
DESCRIPTION = "A configuration validator for Python that produce human readable error messages."
LICENSE = "MIT"

PV = "3.3.1"

RPM_NAME = "python311-cfgv-3.3.1-1.6.noarch.rpm"
RPM_HASH = "a22ac19d92bde312188ee6d46b52749b45da83c27779d70a0e686a026dc3321c2492e59ecd8851a2ed8d2f6b3f1b91ec39898e909f4a70a1084d700ad671bb14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cfgv) \
python311-cfgv \
python3dist(cfgv)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
