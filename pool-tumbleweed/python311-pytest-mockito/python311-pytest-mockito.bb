SUMMARY = "Convenience plugin on top of mockito"
DESCRIPTION = "Integration of Mockito functionality into Pytest. \
 \
For example: \
  def test_foo(when): \
      when(os.path).exists('/foo').thenReturn(False)"
LICENSE = "MIT"

PV = "0.0.4"

RPM_NAME = "python311-pytest-mockito-0.0.4-2.9.noarch.rpm"
RPM_HASH = "db9eaf2d764863af11e126db2c7a5461be971eac3fbe8fbf8f603fd501376dc958bc9fc57315a224deeab3cddd8373b3207dffb1f8298fa0e4bbaab6b1383b1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-mockito \
python3.11dist-pytest-mockito \
python311-pytest-mockito \
python3dist-pytest-mockito"

RDEPENDS:${PN} += "ca-certificates \
python-abi \
python311 \
python311-mockito \
python311-pytest"

inherit rpm
