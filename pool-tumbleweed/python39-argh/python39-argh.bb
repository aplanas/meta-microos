SUMMARY = "An argparse wrapper"
DESCRIPTION = "This Python module provides a wrapper for argparse with support for hierarchical \
commands that can be bound to modules or classes. \
 \
Features that argh adds to argparse: \
 \
* mark a function as a CLI command and specify its arguments before the parser \
  is instantiated; \
* nested commands made easy: no messing with subparsers (though they are of \
  course used under the hood); \
* infer agrument type from the default value; \
* infer command name from function name; \
* add an alias root command help for the --help argument; \
* enable passing unwrapped arguments to certain functions instead of a \
  argparse.Namespace object. \
 \
Argh is fully compatible with argparse. argh-agnostic and argh-aware code \
can be mixed. Keep in mind that argh.dispatch does some extra \
work that a custom dispatcher may not do."
LICENSE = "LGPL-3.0-or-later"

PV = "0.28.1"

RPM_NAME = "python39-argh-0.28.1-1.3.noarch.rpm"
RPM_HASH = "8d57a02901544acb3b60f823205af8e3af3d69349425bdafcbba017a371f85071125cd8257ed965bdf356b60c5041ecd083081df62293c358ebe3ebd5ce4a79c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-argh \
python39-argh \
python3dist-argh"

RDEPENDS:${PN} += "python-abi"

inherit rpm
