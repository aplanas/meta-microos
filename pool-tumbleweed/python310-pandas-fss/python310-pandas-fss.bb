SUMMARY = "The python pandas[fss] extra"
DESCRIPTION = "This package provides the [fss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-pandas-fss-2.1.0-1.2.noarch.rpm"
RPM_HASH = "d1f432c6b690bcf7e00152540c5881de370205ed053f1ce69d03710d627372d1ee021174af7916f6e9efe732cba86b924ac0f9f955f000fd55f287639e5448ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-fss"

RDEPENDS:${PN} += "python310-fsspec \
python310-pandas"

inherit rpm
