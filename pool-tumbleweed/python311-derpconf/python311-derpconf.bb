SUMMARY = "Configuration file loader"
DESCRIPTION = "derpconf abstracts loading configuration files for your app."
LICENSE = "MIT"

PV = "0.8.3"

RPM_NAME = "python311-derpconf-0.8.3-2.1.noarch.rpm"
RPM_HASH = "56f4240eea94eb0abc33735875314e9729ee24f6ad0ba0728a8d95e2d87e1defe91970f4861aae73f2edbfea2f26763612d06dc89932e48f6893092a8cb184eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(derpconf) \
python311-derpconf \
python3dist(derpconf)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
