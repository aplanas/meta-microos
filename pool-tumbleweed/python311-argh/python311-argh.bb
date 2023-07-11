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

RPM_NAME = "python311-argh-0.28.1-1.3.noarch.rpm"
RPM_HASH = "8a1ae6cbe433ad99625daf371d431be611c8df53dd5a002c57e9a92d2bff3f692b6d598a0238bbd7a8f4d98a6d64ae679f12c2f4459798e1893bc1cf2dcd3c92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-argh \
python3.11dist-argh \
python311-argh \
python3dist-argh"

RDEPENDS:${PN} += "python-abi"

inherit rpm
