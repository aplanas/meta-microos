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

RPM_NAME = "python39-cfgdiff-0.0.0+git.1641843506.dc1234a-1.9.noarch.rpm"
RPM_HASH = "a115ba959b64abc3cb4d0016d26048e83e3348e0e3c861fb619002666dd78f30976d1f2c058172a47a23c26e86a9fafbf977bc3c3f5e94704c828b60d2f5c1ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cfgdiff \
python3.9dist-cfgdiff \
python39-cfgdiff \
python3dist-cfgdiff"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-configobj \
python39-dnspython \
python39-lxml"

inherit rpm
