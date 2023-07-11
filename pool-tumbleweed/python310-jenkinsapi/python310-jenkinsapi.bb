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

RPM_NAME = "python310-jenkinsapi-0.3.13-1.1.noarch.rpm"
RPM_HASH = "c32d28d3a5a06e7d95269d50630f1815c081b45c5746b40dbc469dcc9c30a915c49e105ce6cf6c53ee37f1a613ce36cc238604e59ace5837abac2118bfe40867"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jenkinsapi \
python310-jenkinsapi \
python3dist-jenkinsapi"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-pytz \
python310-requests \
python310-six \
update-alternatives"

inherit rpm
