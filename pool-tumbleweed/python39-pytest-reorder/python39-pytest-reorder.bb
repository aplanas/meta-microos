SUMMARY = "Pytest plugin for reordering tests depending on their paths and names"
DESCRIPTION = "Reorder tests depending on their nodeids (strings of test file path plus test name plus \
parametrization, like: \
``test/test_prefix_reordering.py::test_reordering_default[test_names5-expected_test_order5]``). \
 \
Normally tests are sorted alphabetically. That makes integration tests run before unit tests. \
 \
With **pytest_reorder** you can install a hook that will change the order of tests in the suite. \
By default **pytest_reorder** will seek for *unit*, *integration* and *ui* tests and put them in \
the following order: \
 \
  * *unit* \
  * all tests with names not indicating unit, integration, nor UI tests \
  * *integration* \
  * *ui* \
 \
The default regular expressions can find unit, integration and UI tests both laid flat and **deeply \
nested**. You can also specify your custom order."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python39-pytest-reorder-0.1.1-2.9.noarch.rpm"
RPM_HASH = "b33180d66f6938ca40104b25f3defc7d275fd4c4ec7c72989517e1fedba399b6f4e389f044dbc63efb1c05bf149d086efdd5c9427fd33e8a7e5c9273d9c9da9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-reorder \
python39-pytest-reorder \
python3dist-pytest-reorder"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
