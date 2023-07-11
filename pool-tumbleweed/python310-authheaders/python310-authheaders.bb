SUMMARY = "A library wrapping email authentication header verification and generation"
DESCRIPTION = "A library wrapping email authentication header verification and generation."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "python310-authheaders-0.14.1-2.3.noarch.rpm"
RPM_HASH = "de585f7fac708ec6b27abbd8d29a439df50c98b93d305bb801c49d281fa8950f3cddb281cd6d0dbed7c6058454d16916cd096f6659d902a101057f6a3482388e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-authheaders \
python310-authheaders \
python3dist-authheaders"

RDEPENDS:${PN} += "python-abi \
python310-authres \
python310-dkimpy \
python310-dnspython \
python310-publicsuffix2"

inherit rpm
