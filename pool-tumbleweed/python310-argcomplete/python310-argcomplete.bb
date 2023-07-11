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

PV = "3.1.1"

RPM_NAME = "python310-argcomplete-3.1.1-1.1.noarch.rpm"
RPM_HASH = "2f16fb959368707a1b2a26b73451fd1b94c32130ceb53435f4fac0dc22207bc1e1e1427ecad583e05ab15d246fa77d66ba723e81a3f092ddc0244f473fed2b32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-argcomplete \
python310-argcomplete \
python3dist-argcomplete"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
