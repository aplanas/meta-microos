SUMMARY = "Retrieve names of code references"
DESCRIPTION = "'Sub::Identify' allows you to retrieve the real name of code references. \
 \
It provides six functions, all of them taking a code reference. \
 \
'sub_name' returns the name of the code reference passed as an argument (or \
'__ANON__' if it's an anonymous code reference), 'stash_name' returns its \
package, and 'sub_fullname' returns the concatenation of the two. \
 \
'get_code_info' returns a list of two elements, the package and the \
subroutine name (in case of you want both and are worried by the speed.) \
 \
In case of subroutine aliasing, those functions always return the original \
name. \
 \
'get_code_location' returns a two-element list containing the file name and \
the line number where the subroutine has been defined. \
 \
'is_sub_constant' returns a boolean value indicating whether the subroutine \
is a constant or not."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.14"

RPM_NAME = "perl-Sub-Identify-0.14-1.34.aarch64.rpm"
RPM_HASH = "d3edf67cc04c828116f50bfaa89995c10ef0f0dec2dc3fd2d7248b00a6beead65f7779ad07d6d72575f0244fdefd93023dedaa64b66d612510295f6d65a1cd2f"

RPROVIDES:${PN} += "perl-Sub--Identify \
perl-Sub-Identify"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
