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

RPM_NAME = "python311-argcomplete-3.1.1-1.1.noarch.rpm"
RPM_HASH = "b920fcb55f4c8e29fe78583a69195e9cc86ff7be56d49d19a53e5045a0111fbc407098ef4a1da60318f323c9d6f02a02f1171c484a12eaf76750ed72390ef135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-argcomplete \
python3.11dist-argcomplete \
python311-argcomplete \
python3dist-argcomplete"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
