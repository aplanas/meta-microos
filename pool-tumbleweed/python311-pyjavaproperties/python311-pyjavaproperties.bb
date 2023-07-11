SUMMARY = "Python library for parsing Java properties"
DESCRIPTION = "A python library for parsing Java properties files."
LICENSE = "MIT"

PV = "0.7"

RPM_NAME = "python311-pyjavaproperties-0.7-2.16.noarch.rpm"
RPM_HASH = "d9f29db11c6774de8bfd587dc66e7bab815364e9a0dcb5d527c7d6a18a1210321d363dfcc3c98d1ff89ca16908537a08705fc77c764f7cf30987e946749484d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyjavaproperties \
python3.11dist-pyjavaproperties \
python311-pyjavaproperties \
python3dist-pyjavaproperties"

RDEPENDS:${PN} += "python-abi \
python311-base"

inherit rpm
