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

RPM_NAME = "python39-jenkinsapi-0.3.13-1.1.noarch.rpm"
RPM_HASH = "cf91982c21ca1edd3ed32d8cba302ec1b96bfc775b2d5c4f440b28ee7c7775629fe52e8c37aec53701af2a7f8f37ff81ac3d721c4caa15d23b9847630978ab82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jenkinsapi \
python39-jenkinsapi \
python3dist-jenkinsapi"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-pytz \
python39-requests \
python39-six \
update-alternatives"

inherit rpm
