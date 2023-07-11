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

RPM_NAME = "python39-argcomplete-3.1.1-1.1.noarch.rpm"
RPM_HASH = "214dc1ebdc9def2c9b38799bcbd57f6d8f002c18d53bc07f64ce77a56f2386fcb2d71e24184b763ab21a72c8619fbffa5a2b8a080d95bef4673ea9cc1bc7eacb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-argcomplete \
python39-argcomplete \
python3dist-argcomplete"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
