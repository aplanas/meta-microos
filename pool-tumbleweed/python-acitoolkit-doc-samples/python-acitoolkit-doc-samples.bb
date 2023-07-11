SUMMARY = "Sample code for the Python acitoolkit library"
DESCRIPTION = "Python samples for using acitoolkit for programming ACI."
LICENSE = "Apache-2.0"

PV = "0.4"

RPM_NAME = "python-acitoolkit-doc-samples-0.4-6.1.noarch.rpm"
RPM_HASH = "71bd2d2df45c0ffe760398d7e37ed43b45f21fd873cfd84556f0075b64da96fea3e859c99b230f010aec57e94a7d99761dd77e55900eb9b0bb184f70a322e048"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-acitoolkit-doc-samples"

RDEPENDS:${PN} += "python-acitoolkit-doc \
python3-PyMySQL"

inherit rpm
