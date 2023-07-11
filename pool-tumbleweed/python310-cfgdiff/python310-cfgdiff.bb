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

RPM_NAME = "python310-cfgdiff-0.0.0+git.1641843506.dc1234a-1.9.noarch.rpm"
RPM_HASH = "a43db41d70ad421c065c0b0b09f08150636e15fdfdb54efc780b44b8a23eebb9bb4aea66a6d7b04a8871889bd966b65528ea916a45db1f9be0ed12a758028dd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cfgdiff \
python3.10dist-cfgdiff \
python310-cfgdiff \
python3dist-cfgdiff"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-configobj \
python310-dnspython \
python310-lxml"

inherit rpm
