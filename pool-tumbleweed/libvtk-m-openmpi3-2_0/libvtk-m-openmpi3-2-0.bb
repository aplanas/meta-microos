SUMMARY = "Visualization ToolKit for Many-cores (vtk-m) run-time libraries"
DESCRIPTION = "VTK-m is a toolkit of scientific visualization algorithms for emerging \
processor architectures. \
 \
This package provides the shared libraries for VTK-m."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "libvtk-m-openmpi3-2_0-2.0.0-1.1.aarch64.rpm"
RPM_HASH = "337c8ad096e373d36d8b31f4133d201f2dd20917303a49b4bb277fe64f784a35dc61d10d827c885e714d484528f695b3aeb1ecfaeec2e557991f8f5992842a19"

RPROVIDES:${PN} += "libvtk-m-openmpi3-2_0 \
libvtk-m-openmpi3-2_0(aarch-64) \
libvtkm_cont.so.2.0()(64bit) \
libvtkm_cont_testing.so.2.0()(64bit) \
libvtkm_filter_clean_grid.so.2.0()(64bit) \
libvtkm_filter_connected_components.so.2.0()(64bit) \
libvtkm_filter_contour.so.2.0()(64bit) \
libvtkm_filter_core.so.2.0()(64bit) \
libvtkm_filter_density_estimate.so.2.0()(64bit) \
libvtkm_filter_entity_extraction.so.2.0()(64bit) \
libvtkm_filter_field_conversion.so.2.0()(64bit) \
libvtkm_filter_field_transform.so.2.0()(64bit) \
libvtkm_filter_flow.so.2.0()(64bit) \
libvtkm_filter_geometry_refinement.so.2.0()(64bit) \
libvtkm_filter_image_processing.so.2.0()(64bit) \
libvtkm_filter_mesh_info.so.2.0()(64bit) \
libvtkm_filter_multi_block.so.2.0()(64bit) \
libvtkm_filter_resampling.so.2.0()(64bit) \
libvtkm_filter_scalar_topology.so.2.0()(64bit) \
libvtkm_filter_vector_analysis.so.2.0()(64bit) \
libvtkm_filter_zfp.so.2.0()(64bit) \
libvtkm_io.so.2.0()(64bit) \
libvtkm_rendering.so.2.0()(64bit) \
libvtkm_rendering_testing.so.2.0()(64bit) \
libvtkm_source.so.2.0()(64bit) \
libvtkm_worklet.so.2.0()(64bit) \
libvtkmdiympi.so.2.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libmpi.so.40()(64bit) \
libstdc++.so.6()(64bit) \
openmpi3"

inherit rpm
