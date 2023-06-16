SUMMARY = "Python API and tools to manipulate OpenDocument files"
DESCRIPTION = "Odfpy is a library to read and write OpenDocument v. 1.1 files. \
The main focus has been to prevent the programmer from creating invalid \
documents. It has checks that raise an exception if the programmer adds \
an invalid element, adds an attribute unknown to the grammar, forgets to \
add a required attribute or adds text to an element that doesn't allow it. \
 \
These checks and the API itself were generated from the RelaxNG \
schema, and then hand-edited. Therefore the API is complete and can \
handle all ODF constructions. \
 \
In addition to the API, there are a few scripts: \
 \
- csv2odf - Create OpenDocument spreadsheet from comma separated values \
- mailodf - Email ODF file as HTML archive \
- odf2xhtml - Convert ODF to (X)HTML \
- odf2mht - Convert ODF to HTML archive \
- odf2xml - Create OpenDocument XML file from OD? package \
- odfimgimport - Import external images \
- odflint - Check ODF file for problems \
- odfmeta - List or change the metadata of an ODF file \
- odfoutline - Show outline of OpenDocument \
- odfuserfield - List or change the user-field declarations in an ODF file \
- xml2odf - Create OD? package from OpenDocument in XML form \
 \
Visit https://github.com/eea/odfpy for documentation and examples."
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "1.4.2"

RPM_NAME = "python311-odfpy-1.4.2-1.4.noarch.rpm"
RPM_HASH = "2ef71111aae4e7d0cfda45784f902b348851a90917157d01ba6352d3b9bc85976bede7241d75161d4459f6722a0fb7073c1612edbe2f317f00d45593ba4f8eed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-odfpy \
python311-odfpy \
python3dist-odfpy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-defusedxml \
update-alternatives"

inherit rpm
