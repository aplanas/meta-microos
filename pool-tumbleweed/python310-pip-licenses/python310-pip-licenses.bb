SUMMARY = "Python packages license list"
DESCRIPTION = "Dump the software license list of Python packages installed with pip."
LICENSE = "MIT"

PV = "4.3.2"

RPM_NAME = "python310-pip-licenses-4.3.2-1.1.noarch.rpm"
RPM_HASH = "a57a63ecf673cf690bedde108d38a3adab277a1f310f7c81fa95863304ba90edf9f920a1c35c9f61d9380efa5bbced2366c24f5338de88e660039683507a061d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip-licenses \
python3.10dist(pip-licenses) \
python310-pip-licenses \
python3dist(pip-licenses)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-PrettyTable \
python310-pip \
update-alternatives"

inherit rpm
