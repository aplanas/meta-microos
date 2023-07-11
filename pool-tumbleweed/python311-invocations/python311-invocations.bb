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

RPM_NAME = "python311-invocations-3.0.2-2.3.noarch.rpm"
RPM_HASH = "4602940c7706283b5dcd1226d5b997483a92c930df2fcfcd6460812d34f1192e5cb5235cc19a7524065af9b567a4b0cbda20b462c25c77acb516b37ed9b625cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-invocations \
python3.11dist-invocations \
python311-invocations \
python3dist-invocations"

RDEPENDS:${PN} += "python-abi \
python311-blessings \
python311-invoke \
python311-lexicon \
python311-releases \
python311-semantic-version \
python311-tabulate \
python311-tqdm \
python311-twine \
python311-wheel"

inherit rpm
