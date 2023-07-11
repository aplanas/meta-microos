SUMMARY = "Extension to Sphinx for documenting APIs built with Pecan and WSME"
DESCRIPTION = "Extension to Sphinx for documenting APIs built with Pecan and WSME"
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python310-sphinxcontrib-pecanwsme-0.10.0-3.3.noarch.rpm"
RPM_HASH = "0807b91ea9d148fc0deeb76011ff6d24bed2706856ba6b0139fa1cdaad60dc13c30db6a35b982da3d21ef5170c09dba773b6445ae740496eafdbbd8bca74356b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-pecanwsme \
python310-sphinxcontrib-pecanwsme \
python3dist-sphinxcontrib-pecanwsme"

RDEPENDS:${PN} += "python-abi \
python310-sphinxcontrib-httpdomain"

inherit rpm
