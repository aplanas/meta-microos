SUMMARY = "Bash tab completion for argparse"
DESCRIPTION = "Argcomplete provides easy, extensible command line tab completion of \
arguments for your Python script. \
 \
It makes two assumptions: \
 \
* You're using bash as your shell \
* You're using argparse to manage your command line arguments/options \
 \
Argcomplete is particularly useful if your program has lots of options \
or subparsers, and if your program can dynamically suggest completions \
for your argument/option values (for example, if the user is browsing \
resources over the network)."
LICENSE = "Apache-2.0"

PV = "3.0.8"

RPM_NAME = "python39-argcomplete-3.0.8-2.1.noarch.rpm"
RPM_HASH = "b671ce9b8275b0f64790ed3c28f1da4be4c0c87c62341621f109c6ef1ee5e30dbbf674fdc0c52423dc724903170b74f7dc3a1c08488cf0a284bffd9f739efc22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-argcomplete \
python39-argcomplete \
python3dist-argcomplete"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
