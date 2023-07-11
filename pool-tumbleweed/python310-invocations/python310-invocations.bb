SUMMARY = "Reusable Invoke tasks"
DESCRIPTION = "Invocations is a collection of reusable `Invoke <http://pyinvoke.org>`_ \
tasks/task modules, including (but not limited to) Python project management \
tools such as documentation building and dependency organization. \
 \
It has no stand-alone components and is designed to be imported into your \
pre-existing Invoke task files. \
 \
Invocations is currently in pre-alpha status and is unsupported. Please follow \
the Invoke project's communication channels for updates. Thanks!"
LICENSE = "BSD-2-Clause"

PV = "3.0.2"

RPM_NAME = "python310-invocations-3.0.2-2.3.noarch.rpm"
RPM_HASH = "e17f8464318b0be18dbd1167a9557c949b65d6e04f18232b8e7456ea1c2794019bd77b677f58fee0ba3672ad6721d53fba7ef1d30f10fe1855caf58d336c4afc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-invocations \
python310-invocations \
python3dist-invocations"

RDEPENDS:${PN} += "python-abi \
python310-blessings \
python310-invoke \
python310-lexicon \
python310-releases \
python310-semantic-version \
python310-tabulate \
python310-tqdm \
python310-twine \
python310-wheel"

inherit rpm
