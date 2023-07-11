SUMMARY = "Convenience plugin on top of mockito"
DESCRIPTION = "Integration of Mockito functionality into Pytest. \
 \
For example: \
  def test_foo(when): \
      when(os.path).exists('/foo').thenReturn(False)"
LICENSE = "MIT"

PV = "0.0.4"

RPM_NAME = "python310-pytest-mockito-0.0.4-2.9.noarch.rpm"
RPM_HASH = "6ba18b78eb1a14b49bd83a0d203b32771723fae08fb95a77a2a54c9d1cabc7410a14bb85df80db18aff32e70acad6c0f706c2a5d75d44251e8b3b532dfc73c50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-mockito \
python310-pytest-mockito \
python3dist-pytest-mockito"

RDEPENDS:${PN} += "ca-certificates \
python-abi \
python310 \
python310-mockito \
python310-pytest"

inherit rpm
