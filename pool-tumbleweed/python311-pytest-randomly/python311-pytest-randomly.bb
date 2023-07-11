SUMMARY = "Pytest plugin to randomly order tests and control random.seed"
DESCRIPTION = "Pytest plugin to randomly order tests and control random.seed. \
 \
Features: \
   * Randomly shuffles the order of test items. This is done first at \
     the level of modules, then at the level of test classes (if you \
     have them), then at the order of functions. This also works with \
     things like doctests. \
   * Resets random.seed() at the start of every test case and test to \
     fixed number - this defaults to time.time() from the start of \
     your test run, but you can pass in --randomly-seed to repeat a \
     randomness-induced failure. \
   * If factory boy is installed, its random state is reset at the \
     start of every test. This allows for repeatable use of its random \
     'fuzzy' features. \
   * If faker is installed, its random state is reset at the start of \
     every test. This is also for repeatable fuzzy data in tests. \
   * If numpy is installed, its random state is reset at the start of \
     every test."
LICENSE = "MIT"

PV = "3.12.0"

RPM_NAME = "python311-pytest-randomly-3.12.0-1.3.noarch.rpm"
RPM_HASH = "ea69a17be42356387582d6d329d4c4043bea94028351e98159080283f6a1bd70d50de3ad504e8efa86b97d556623751d0b055e0df0762a4326898543ffdfef5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-randomly \
python3.11dist-pytest-randomly \
python311-pytest-randomly \
python3dist-pytest-randomly"

RDEPENDS:${PN} += "python-abi \
python311-importlib-metadata \
python311-pytest"

inherit rpm
