SUMMARY = "Command-line interface for python modules"
DESCRIPTION = "entrypoint2 is a command-line interface for python modules, forked \
off entrypoint."
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "python310-entrypoint2-1.1-2.2.noarch.rpm"
RPM_HASH = "3b15a74d2128affb95f9f9f777565dd2a04216105b8e7a39365b86d24e908a1e08c2afe90b4cd9bfc0a16b9dd96ffa9a88eb268a30d35820e841b82b059c24dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-entrypoint2 \
python310-entrypoint2 \
python3dist-entrypoint2"

RDEPENDS:${PN} += "python-abi \
python310-EasyProcess \
python310-decorator \
python310-path.py"

inherit rpm
