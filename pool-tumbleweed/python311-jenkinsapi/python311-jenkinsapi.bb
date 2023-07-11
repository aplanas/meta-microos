SUMMARY = "A Python API for accessing resources on a Jenkins continuous integration server"
DESCRIPTION = "Jenkins is a continuous integration system. \
 \
Jenkins (and its predecessor Hudson) are projects for automating \
common development tasks (e.g. unit testing, production batches), but \
they are somewhat Java-centric. The designers have provided a REST \
interface. This library wraps up that interface as more conventional \
Python objects. \
 \
This library can help to: \
 \
 * Query the test-results of a completed build \
 * Get a objects representing the latest builds of a job \
 * Search for artefacts by simple criteria \
 * Block until jobs are complete \
 * Install artefacts to custom-specified directory structures \
 \
and has \
 \
 * username/password auth support for jenkins instances with auth turned on \
 * Ability to search for builds by subversion revision \
 * Ability to add/remove/query Jenkins slaves \
 * Ability to add/remove/modify Jenkins views"
LICENSE = "MIT"

PV = "0.3.13"

RPM_NAME = "python311-jenkinsapi-0.3.13-1.1.noarch.rpm"
RPM_HASH = "82ce8baa72cd720d6ba0056bee8cdd3fb6054de6c715217c8a7483f2f31cf55437d5a27e80a7340935a0f353cf7d0345527f0651d243767c62949e9b526995f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jenkinsapi \
python3.11dist-jenkinsapi \
python311-jenkinsapi \
python3dist-jenkinsapi"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-pytz \
python311-requests \
python311-six \
update-alternatives"

inherit rpm
