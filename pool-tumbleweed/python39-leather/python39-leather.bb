SUMMARY = "Python charting for 80% of humans"
DESCRIPTION = "Leather is the Python charting library for those who need charts *now* \
and don't care if they're perfect."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python39-leather-0.3.4-2.3.noarch.rpm"
RPM_HASH = "14ecf11ff5a07f71473ad6e1f624cb24020472ab725c4c436cb307454aef2e0d7f21ba3faf9796e0ec0def234a86c5781621eb135ce5731f7bf5e7795068e5f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-leather \
python39-leather \
python3dist-leather"

RDEPENDS:${PN} += "python-abi"

inherit rpm
