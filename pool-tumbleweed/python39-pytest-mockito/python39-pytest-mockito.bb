SUMMARY = "Convenience plugin on top of mockito"
DESCRIPTION = "Integration of Mockito functionality into Pytest. \
 \
For example: \
  def test_foo(when): \
      when(os.path).exists('/foo').thenReturn(False)"
LICENSE = "MIT"

PV = "0.0.4"

RPM_NAME = "python39-pytest-mockito-0.0.4-2.9.noarch.rpm"
RPM_HASH = "f8c30b625ee7d65a539932f5b0b98aad77f29a2439e364a8e6e104d37770088964631afda9f4ef9bd18de50903eaf32950ac1ccfe347e2da79176c4fddbd805c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-mockito \
python39-pytest-mockito \
python3dist-pytest-mockito"

RDEPENDS:${PN} += "ca-certificates \
python-abi \
python39 \
python39-mockito \
python39-pytest"

inherit rpm
