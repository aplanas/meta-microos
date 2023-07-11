SUMMARY = "Extract data from python stack frames and tracebacks"
DESCRIPTION = "Extract data from python stack frames and tracebacks for informative displays"
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python311-stack-data-0.6.2-2.3.noarch.rpm"
RPM_HASH = "9076390bb99d43b2896bb730fa8023dc39c1f8292a0550a8aa86b3e77917db338f0313eb96a9f3d4e1aaa599e773be79aae4344bf3ae7b3615608acfb4855400"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stack-data \
python3.11dist-stack-data \
python311-stack-data \
python3dist-stack-data"

RDEPENDS:${PN} += "python-abi \
python311-asttokens \
python311-executing \
python311-pure-eval"

inherit rpm
