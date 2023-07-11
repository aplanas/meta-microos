SUMMARY = "Microsoft Authentication Library (MSAL) for Python Extensions"
DESCRIPTION = "The Microsoft Authentication Library (MSAL) for Python library enables your app \
to access the Microsoft Cloud by supporting authentication of users with Microsoft \
Azure Active Directory accounts (AAD) and Microsoft Accounts (MSA) using industry \
standard OAuth2 and OpenID Connect. \
 \
This packages contains additional extensions."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-msal-extensions-1.0.0-2.3.noarch.rpm"
RPM_HASH = "3d3ca08f16d0ecf49a71d800b3cadeb4d9139e5f7d40d286fb087f9940256460b7b68bcfab75aa56dc9ff8abf88ced20c1fe97a74fefaad4e1ec8e476ff02b93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-msal-extensions \
python310-msal-extensions \
python3dist-msal-extensions"

RDEPENDS:${PN} += "python-abi \
python310-msal \
python310-portalocker"

inherit rpm
