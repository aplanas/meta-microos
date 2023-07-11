SUMMARY = "Structured Configuration Library"
DESCRIPTION = "This package contains documentation files for python311-ZConfig."
LICENSE = "ZPL-2.1"

PV = "3.6.1"

RPM_NAME = "python311-ZConfig-doc-3.6.1-1.5.noarch.rpm"
RPM_HASH = "d0dff16c38aeeb1109fa80fb8b82bf7b00302ae9e1eaeef56ad1464ada8ec3f5d62b71acfc2c6d9e3685524045240d480f96b1ec7bdbdaa972df4757fea13501"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ZConfig-doc \
python311-ZConfig-doc"

RDEPENDS:${PN} += "python311-ZConfig"

inherit rpm
