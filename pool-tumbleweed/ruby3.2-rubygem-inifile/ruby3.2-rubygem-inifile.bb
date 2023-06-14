SUMMARY = "INI file reader and writer"
DESCRIPTION = "Although made popular by Windows, INI files can be used on any system thanks \
to their flexibility. They allow a program to store configuration data, which \
can then be easily parsed and changed. Two notable systems that use the INI \
format are Samba and Trac. \
More information about INI files can be found on the [Wikipedia \
Page](http://en.wikipedia.org/wiki/INI_file). \
 \
The basic element contained in an INI file is the property. Every property has \
a name and a value, delimited by an equals sign *=*. The name appears to the \
left of the equals sign and the value to the right. \
name=value \
 \
Section declarations start with *[* and end with *]* as in `[section1]` and \
`[section2]` shown in the example below. The section declaration marks the \
beginning of a section. All properties after the section declaration will be \
associated with that section. \
 \
All lines beginning with a semicolon *;* or a number sign *#* are considered \
to be comments. Comment lines are ignored when parsing INI files. \
 \
A typical INI file might look like this: \
[section1] \
; some comment on section1 \
var1 = foo \
var2 = doodle \
var3 = multiline values \\ \
are also possible \
[section2] \
 \
var1 = baz \
var2 = shoodle."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "ruby3.2-rubygem-inifile-3.0.0-1.31.aarch64.rpm"
RPM_HASH = "0301a8cf9dabbacfbed0f61f4c47fa423d49e9481b8ce0a865cab86fb835a944e944f6effed1f85e7d6fa104cf5e1c314cea185d3be0593be4591867cb9ed563"

RPROVIDES:${PN} += "ruby3.2-rubygem-inifile \
rubygem-inifile \
rubygem-ruby-3.2.0-inifile \
rubygem-ruby-3.2.0-inifile-3 \
rubygem-ruby-3.2.0-inifile-3.0 \
rubygem-ruby-3.2.0-inifile-3.0.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
