SUMMARY = "Pretty console printing of tabular data"
DESCRIPTION = "Formatted console printing of tabular data. \
tableprint lets you easily print formatted tables of data. \
Unlike other modules, you can print single rows of data at a time \
(useful for printing ongoing computation results)."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python310-tableprint-0.9.1-3.5.noarch.rpm"
RPM_HASH = "db92b1900c581ab969b05cd584f9df67aff899b0d28b874316b3d0d2e6d59af7d40a19962266857cdd3e770e0ab009822f20431443a3a83841b84cf5bcd4ebb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tableprint \
python310-tableprint \
python3dist-tableprint"

RDEPENDS:${PN} += "python-abi \
python310-future \
python310-wcwidth"

inherit rpm
