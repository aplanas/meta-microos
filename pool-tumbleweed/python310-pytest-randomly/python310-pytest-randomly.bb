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

RPM_NAME = "python310-pytest-randomly-3.12.0-1.1.noarch.rpm"
RPM_HASH = "5865bdd6fe7b85d3d5013edc69532e056df524dbedd28e96233fd73079a35a8cb5895790b7c51744661dff33147d155e7ab3df414dcce4b4f0fcaf8b64d9ff33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-randomly \
python3.10dist(pytest-randomly) \
python310-pytest-randomly \
python3dist(pytest-randomly)"
RDEPENDS:${PN} += "python(abi) \
python310-importlib-metadata \
python310-pytest"

inherit rpm
