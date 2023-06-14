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

RPM_NAME = "python311-pytest-reorder-0.1.1-2.7.noarch.rpm"
RPM_HASH = "5e8a082803473d95a1558219df14d29957716e739f95e45eb96a4a49128bc9def43b2abc211335d92c8321ae11f33f5322b35f3582c32bf0bafaabc3e0007f95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-reorder \
python311-pytest-reorder \
python3dist-pytest-reorder"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
