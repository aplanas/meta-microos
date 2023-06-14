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

RPM_NAME = "python310-argcomplete-3.0.8-2.1.noarch.rpm"
RPM_HASH = "f1abd52d92a2adc4ca870379b5ed02611585e3ea693d81733f0cd6294be2a7335dd697bfb76f9c1a0f5ae197ac196888168835cb9c18bbb119f6657fed8a587d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-argcomplete \
python3.10dist-argcomplete \
python310-argcomplete \
python3dist-argcomplete"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
update-alternatives"

inherit rpm
