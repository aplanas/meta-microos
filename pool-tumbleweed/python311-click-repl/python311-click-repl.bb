SUMMARY = "REPL plugin for Click"
DESCRIPTION = "REPL plugin for Click"
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-click-repl-0.2.0-3.3.noarch.rpm"
RPM_HASH = "36ecbd628cb0d6e868a905d23b6eb42428ba53a58231c80a7acf8b1b0312e8273ccbd1358a8a73488ad719e2ac517dc053d8397a7e3168f78f6e0aa885f16632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-repl \
python3.11dist-click-repl \
python311-click-repl \
python3dist-click-repl"

RDEPENDS:${PN} += "python-abi \
python311-click \
python311-prompt-toolkit \
python311-six"

inherit rpm
