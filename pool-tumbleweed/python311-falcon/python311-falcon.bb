SUMMARY = "A web framework for building APIs and app backends"
DESCRIPTION = "Falcon is a Python framework for building cloud \
APIs. It encourages the REST architectural style, and tries to do \
as little as possible while remaining effective."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python311-falcon-3.1.1-2.3.noarch.rpm"
RPM_HASH = "33cceb6e46400b639c366cb6d807545ead264b4ada0768249dc297b59365720ff2584eed9b9f24c7f5297b2f21768553511afc34b69536feb420ebdd6a1171b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-falcon \
python3.11dist-falcon \
python311-falcon \
python3dist-falcon"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
