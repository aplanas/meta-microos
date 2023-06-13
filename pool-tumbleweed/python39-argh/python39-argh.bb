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

PV = "0.26.2"

RPM_NAME = "python39-argh-0.26.2-5.6.noarch.rpm"
RPM_HASH = "263eb5d927c71c0ad77036542945d66ed0293e0f776786d005cb382b19592609233cef0aed1c5a3938710bda9c63b1cd281d730848a352991efbe067cce17665"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(argh) \
python39-argh \
python3dist(argh)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
