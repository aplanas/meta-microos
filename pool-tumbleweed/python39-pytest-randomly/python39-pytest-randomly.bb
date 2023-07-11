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

RPM_NAME = "python39-pytest-randomly-3.12.0-1.3.noarch.rpm"
RPM_HASH = "926a4373f384e37e206fd3a6363d7e2bb2e2d08cff82405c512fda8a8101d84c61190f4b635a25ceaa87c8916d23dca07647f9b0e52fec2537183c94724feefb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-randomly \
python39-pytest-randomly \
python3dist-pytest-randomly"

RDEPENDS:${PN} += "python-abi \
python39-importlib-metadata \
python39-pytest"

inherit rpm
