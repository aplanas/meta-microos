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

RPM_NAME = "python39-pytest-randomly-3.13.0-1.1.noarch.rpm"
RPM_HASH = "4a4044f8edd066c583d616976789baab108f2ea6584f2e45acadb0945721c4ccdfaeff192c67094530637273e788e8bbf6650867d12b9003acee284ec43648ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-randomly \
python39-pytest-randomly \
python3dist-pytest-randomly"

RDEPENDS:${PN} += "python-abi \
python39-importlib-metadata \
python39-pytest"

inherit rpm
