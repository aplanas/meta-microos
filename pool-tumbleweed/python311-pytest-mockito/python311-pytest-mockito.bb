SUMMARY = "Convenience plugin on top of mockito"
DESCRIPTION = "Integration of Mockito functionality into Pytest. \
 \
For example: \
  def test_foo(when): \
      when(os.path).exists('/foo').thenReturn(False)"
LICENSE = "MIT"

PV = "0.0.4"

RPM_NAME = "python311-pytest-mockito-0.0.4-2.7.noarch.rpm"
RPM_HASH = "bd0bd372bfae34e1afc4f4dbbc238add06bc4f996c0ea2bef733cf15b44cc9635854ad1f9869f2c36c32e38ca584fe223b10ec65c4f45a5d363ff6d6bf9835c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-mockito) \
python311-pytest-mockito \
python3dist(pytest-mockito)"

RDEPENDS:${PN} += "ca-certificates \
python(abi) \
python311 \
python311-mockito \
python311-pytest"

inherit rpm
