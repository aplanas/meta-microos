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

RPM_NAME = "python311-cfgdiff-0.0.0+git.1641843506.dc1234a-1.9.noarch.rpm"
RPM_HASH = "a07dbe47924a28f2d8b20d1825977d34418ccea22d6fb693e55efd2230b054335121bc2162cb82c7e653b2b1c0b3feae913ec548b1b15549514cabe25a1a809c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cfgdiff \
python3-cfgdiff \
python3.11dist-cfgdiff \
python311-cfgdiff \
python3dist-cfgdiff"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-configobj \
python311-dnspython \
python311-lxml"

inherit rpm
