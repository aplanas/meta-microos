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

RPM_NAME = "python310-argh-0.28.1-1.3.noarch.rpm"
RPM_HASH = "a71776724683f04191f01affb7e7428af90ca3e8ee6929d12aace9fe11c6182399fa5ab03b8d8cfa57881eebdc2f61cd3068e9f183a32e26d8c849bbe3861966"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-argh \
python310-argh \
python3dist-argh"

RDEPENDS:${PN} += "python-abi"

inherit rpm
