SUMMARY = "Bootstrap5 template pack for django-crispy-forms"
DESCRIPTION = "Bootstrap5 template pack for django-crispy-forms"
LICENSE = "MIT"

PV = "0.7"

RPM_NAME = "python311-crispy-bootstrap5-0.7-1.1.noarch.rpm"
RPM_HASH = "d0c4668a686ec764356c335f5f775d07c30dbb15578f2ced5dabb86f4320220adeab599bf5340b401cd8b353b8c0cdc61ac00e1edbdd0aec0cfb57166b3d3d6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-crispy-bootstrap5 \
python3.11dist-crispy-bootstrap5 \
python311-crispy-bootstrap5 \
python3dist-crispy-bootstrap5"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-django-crispy-forms"

inherit rpm
