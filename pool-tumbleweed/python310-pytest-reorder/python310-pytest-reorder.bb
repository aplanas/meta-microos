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

RPM_NAME = "python310-pytest-reorder-0.1.1-2.9.noarch.rpm"
RPM_HASH = "f1ba78da46d198c76d217a71819ff676c64bb78ed73c9d1ce8f5f9c81c5caf3417b48f78ee6bc0ccb671f482a491f86eb2cc73c72303b3caa3128a749bf20feb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-reorder \
python310-pytest-reorder \
python3dist-pytest-reorder"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
