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

PV = "3.13.0"

RPM_NAME = "python310-pytest-randomly-3.13.0-1.1.noarch.rpm"
RPM_HASH = "cc46d0414b24cd3c54717016b5901832c11162ae6e265e654a418ad3210949483102e62e7a123f0765f27811d3949c3a31b7d5c35df23136a262222e0f2e487a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-randomly \
python310-pytest-randomly \
python3dist-pytest-randomly"

RDEPENDS:${PN} += "python-abi \
python310-importlib-metadata \
python310-pytest"

inherit rpm
