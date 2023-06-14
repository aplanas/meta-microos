SUMMARY = "Cfgdiff -- diff(1) all your configuration files"
DESCRIPTION = "cfgdiff will try to parse your configuration files, fetching all \
the relevant keys and values from them and then pretty-printing \
them in the original format. \
These results are then diffed and the diff is shown to you. \
 \
cfgdiff currently supports the following formats: \
 - INI using Python's ConfigParser library \
 - JSON using Python's JSON library \
 - YAML if the Python YAML library is installed \
 - XML if the Python lxml library is installed"
LICENSE = "MIT"

PV = "0.0.0+git.1641843506.dc1234a"

RPM_NAME = "python311-cfgdiff-0.0.0+git.1641843506.dc1234a-1.7.noarch.rpm"
RPM_HASH = "1d5f5893414495c0dcced09d7c11f1beab4a67a46605c62f9b2c900eac7628cc820353e53211f227d35c0fecd07a7dd8d779e175778e8aed25aecd89e9c916ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cfgdiff \
python3.11dist-cfgdiff \
python311-cfgdiff \
python3dist-cfgdiff"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-PyYAML \
python311-configobj \
python311-dnspython \
python311-lxml"

inherit rpm
